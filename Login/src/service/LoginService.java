package service;

public class LoginService {

	private OpenConnection openConnection;
	
	public LoginService() {
		openConnection = new OpenConnection();
	}
	
	public void consultarActores(){

		Connection conn = null;
		try {
			conn = openConnection.getConnection();
			LoginDao dao = new LoginDao();
			
			List<Cliente> listaCliente = dao.consultarClientes(conn);
			List<Pagos> listaPagos;
			Map<String, List<Pagos>> mapa = new HashMap<>();

			for (Iterator iterator = listaCliente.iterator(); iterator.hasNext();) {
				Cliente cliente = (Cliente) iterator.next();
				listaPagos = d.consultarPagosDao(conn, cliente.getId());
				mapa.put(cliente.getEmail(), listaPagos);

			}

			return mapa;
		} catch (SQLException e) {
			System.err.println("Ha habido un error en la base de datos: " + e.getMessage());
			throw new PeliculasServiceException("Error al obtener actores de la bbdd", e);

		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}
}

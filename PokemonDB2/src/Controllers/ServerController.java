//Edward Barclay
//12092603
package Controllers;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.Configuration.ClassList;

public class ServerController {

	public static void main(String[] args) throws Exception {
		//starts the specified server port
		Server server = new Server(8005);
		WebAppContext ctx = new WebAppContext();
		//loads the webpages from the webapp folder
		ctx.setResourceBase("webapp");
		// sets /pokemon as the start of the url path
		ctx.setContextPath("/pokemon");

		ctx.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/[^/]*jstl.*\\.jar$");
		ClassList classlist = ClassList.setServerDefault(server);
		classlist.addBefore("org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
				"org.eclipse.jetty.annotations.AnnotationConfiguration");

		//commands to create the servlet and link the address
		ctx.addServlet("Servlets.ServletHome", "/home");
		ctx.addServlet("Servlets.ServletPokedex", "/pokedex");
		ctx.addServlet("Servlets.ServletPokedexPractice", "/Practice");
		ctx.addServlet("Servlets.ServletPokefile", "/PokeFile");
		ctx.addServlet("Servlets.ServletPokedexgame", "/Pokedexgame");
		ctx.addServlet("Servlets.ServletItems", "/Items");
		//starts the server using the servlets address
		server.setHandler(ctx);
		server.start();
		server.join();
	}
}

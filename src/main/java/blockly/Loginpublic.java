package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", put = "Public")
public class Loginpublic {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// loginpublic
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.openUrl"),
						Var.valueOf("src/main/webapp/views/public/userpublic.view.html"), Var.VAR_FALSE,
						Var.valueOf(600), Var.valueOf(800));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.startInsertingMode"),
						Var.valueOf("User"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}

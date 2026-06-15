public class day8  {
    sealed interface LoginResult permits LoginSuccess , LoginFailure, LoginLoading {

    }
    record LoginSuccess(String time) implements LoginResult {

    }
    record LoginFailure(String reason)  implements LoginResult {

    }

    record LoginLoading(String expectedTime)  implements LoginResult {

    }

    record Random(String reason){

    }

    static void handleLogin(LoginResult result) {
        switch (result) {
            case LoginSuccess success -> System.out.println("Login Success at : " + success.time());
            case LoginFailure failure -> System.out.println("Login Failure because of " + failure.reason());
            case LoginLoading loading -> System.out.println("Login Loading, " + loading.expectedTime());
        }
    }

    static void main() {
        LoginResult loginSuccess = new LoginSuccess("2026-06-13:03:03:10");
        LoginResult loginFailure = new LoginFailure("Insufficient balance");
        LoginResult loginLoading = new LoginLoading("Check after 5 hours");

        handleLogin(loginSuccess);
        handleLogin(loginFailure);
        handleLogin(loginLoading);



    }


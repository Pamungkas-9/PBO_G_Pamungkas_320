public class Admin extends User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public void login(String userInput, String passInput) {
        if (userInput.equals(getUsername()) && passInput.equals(getPassword())) {
            displayInfo();
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin Berhasil!");
    }
}

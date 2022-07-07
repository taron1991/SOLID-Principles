package openclosed;

public class Base64Hasher implements PasswordHasher {

    @Override
    public String hashPassword(String password)
    {
        return "hashed with 64";
    }
}

package openclosed;

public class MD5Hasher implements PasswordHasher{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with 64";
    }

}

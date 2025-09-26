public static void main(String[] args) throws Exception {
    char[] password = "hunter2".toCharArray();
    byte[] salt = "somesalt".getBytes();
    PBEKeySpec spec = new PBEKeySpec(password, salt, 65536, 256);

    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
    SecretKey key = factory.generateSecret(spec);

    System.out.println("Derived key format: " + key.getFormat());
}

void main() {
    String pem = """
            -----BEGIN PUBLIC KEY-----
            MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDgjDohS0RHP395oJxciVaeks9N
            KNY5m9V1IkBBwYsMGyxskrW5sapgi9qlGSYOma9kkko1xlBs17qG8TTg38faxgGJ
            sLT2BAmdVFwuWdRtzq6ONn2YPHYj5s5pqx6vU5baz58/STQXNIhn21QoPjXgQCnj
            Pp0OxnacWeRSnAIOmQIDAQAB
            -----END PUBLIC KEY-----
            """;

    try {
        String base64 = pem.replaceAll("-----.*-----", "").replaceAll("\\s", "");
        byte[] keyBytes = Base64.getDecoder().decode(base64);

        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory factory = KeyFactory.getInstance("RSA");
        PublicKey key = factory.generatePublic(spec);

        System.out.println("Loaded key: " + key.getAlgorithm());
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
        e.printStackTrace();
    }
}

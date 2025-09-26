public static void main(String[] args) {
    var greeting = StableValue.<String>of();

    String message = greeting.orElseSet(() -> "Hello from StableValue!");
    System.out.println(message);
}

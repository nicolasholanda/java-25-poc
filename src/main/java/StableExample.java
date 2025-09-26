void main(){
    var greeting = StableValue.<String>of();
    var message = greeting.orElseSet(() -> "Hello from StableValue!");
    System.out.println(message);
}

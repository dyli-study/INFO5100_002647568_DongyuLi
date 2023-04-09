class Member implements Subscriber {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void update(String message) {

        System.out.println("Dear " + name + ", " + message);
    }
}

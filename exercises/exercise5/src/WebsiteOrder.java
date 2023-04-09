public class WebsiteOrder {
    public static void main(String[] args) {

        Member member1 = new Member("member1");
        Member member2 = new Member("member2");
        Member member3 = new Member("member3");

        Usersub Usersub = null;
        Usersub = Usersub.getInstance();
        Usersub.addSubscriber(member1);
        Usersub.addSubscriber(member2);
        Usersub.addSubscriber(member3);

        TierLevel tierLevel = new TierLevel();
        Tier diamond = tierLevel.createTier("Diamond");
        Tier gold = tierLevel.createTier("Gold");
        Tier silver = tierLevel.createTier("Silver");

        Usersub.pushSubscribers(diamond.getName() + " is now your tier.");
        Usersub.pushSubscribers(gold.getName() + " is now your tier.");
        Usersub.pushSubscribers(silver.getName() + " is now your tier.");

        Usersub.removeSubscriber(member1);



    }
}

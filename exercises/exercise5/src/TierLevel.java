class TierLevel {
    public Tier createTier(String type) {
        if ("Diamond".equalsIgnoreCase(type)) {
            return new Diamond();
        } else if ("Gold".equalsIgnoreCase(type)) {
            return new Gold();
        } else if ("Silver".equalsIgnoreCase(type)) {
            return new Silver();
        }
        return null;
    }
}

public enum Environment {
    PRODUCTION {
        @Override
        public String getUrl() {
            return "https://api.java.com";
        }
    },TEST {
        @Override
        public String getUrl() {
            return "https://api-test.java.com";
        }
    },STAGING {
        @Override
        public String getUrl() {
            return "https://api.staging.java.com";
        }
    };

    public abstract String getUrl();

}

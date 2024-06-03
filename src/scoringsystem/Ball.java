    package scoringsystem;

    public class Ball {
        int ballId;
        int ballCount;
        PlayerInstance bowledBy;
        PlayerInstance playerBy;
        boolean isWicket;
        int runs;
        BallType ballType;
        String description;

        public PlayerInstance getBowledBy() {
            return bowledBy;
        }

        public int getRuns() {
            return runs;
        }

        public BallType getBallType() {
            return ballType;
        }

        public int getBallCount() {
            return ballCount;
        }

        public int getBallId() {
            return ballId;
        }

        public PlayerInstance getPlayerBy() {
            return playerBy;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public void setBallCount(int ballCount) {
            this.ballCount = ballCount;
        }

        public void setBallType(BallType ballType) {
            this.ballType = ballType;
        }

        public void setBowledBy(PlayerInstance bowledBy) {
            this.bowledBy = bowledBy;
        }

        public void setPlayerBy(PlayerInstance playerBy) {
            this.playerBy = playerBy;
        }

        public void setBallId(int ballId) {
            this.ballId = ballId;
        }
    }

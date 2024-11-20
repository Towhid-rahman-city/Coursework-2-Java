public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    // Constructor
    public ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    // Getter methods
    public String getExpeditionLeaderName() {
        return expeditionLeader.getName();
    }

    public String getArchivistName() {
        return archivist.getName();
    }

    public String getFieldResearcherName() {
        return fieldResearcher.getName();
    }
}

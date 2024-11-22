public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    // Constructors
    public ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    // Getter for getExpeditionLeaderName
    public String getExpeditionLeaderName() {
        return expeditionLeader.getName();
    }

    // Getter for getArchivistName
    public String getArchivistName() {
        return archivist.getName();
    }

    // Getter for getFieldResearcherName
    public String getFieldResearcherName() {
        return fieldResearcher.getName();
    }
}

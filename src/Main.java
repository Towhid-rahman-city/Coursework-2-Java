public class Main {
    public static void main(String[] args) {
        // Initialise arrays of names and student IDs
        String[] allNames = {"Mohammed", "Towhid", "Bob", "Jon", "Sunny", "Steve"};
        String[] allStudentIDs = {"001", "002", "003", "004", "005", "006"};


        // Creating the member pool
        // Randomly assign between 4 and 6 new members to the members array each time the program runs.
        int memberCount = 4 + (int)(Math.random() * 3);
        ExpeditionMember[] members = new ExpeditionMember[memberCount];

        // Setting the names and IDs for each member from the predefined arrays.
        // Mix the names and IDs by randomly assigning them
        int[] mix = new int[allNames.length];
        for (int i = 0; i < allNames.length; i++) mix[i] = i;

        // Mix "mix" to randomly assign names and IDs
        for (int i = 0; i < mix.length; i++) {
            int j = (int) (Math.random() * mix.length);  // Get a random index
            int temp = mix[i];
            mix[i] = mix[j];
            mix[j] = temp;
        }

        // Now assign the mix members
        for (int i = 0; i < memberCount; i++) {
            members[i] = new ExpeditionMember(allNames[mix[i]], allStudentIDs[mix[i]]);
        }


        // Assign roles to the first 3 members of the pool for Pyramid Expedition
        ResearchExpedition pyramidExpedition = new ResearchExpedition(
                members[0], members[1], members[2]);
        // Assign roles to the last 3 members for Nile Expedition
        ResearchExpedition nileExpedition = new ResearchExpedition(
                members[members.length - 3], members[members.length - 2], members[members.length - 1]);


        // Print the names of the Expedition Leader, Archivist, and Field Researcher for each expedition.
        System.out.println("Pyramid Expedition Core Members:");
        System.out.println("Leader is " + pyramidExpedition.getExpeditionLeaderName());
        System.out.println("Archivist is " + pyramidExpedition.getArchivistName());
        System.out.println("Field Researcher is " + pyramidExpedition.getFieldResearcherName());

        System.out.println("Nile Expedition Core Members:");
        System.out.println("Leader is " + nileExpedition.getExpeditionLeaderName());
        System.out.println("Archivist is " + nileExpedition.getArchivistName());
        System.out.println("Field Researcher is " + nileExpedition.getFieldResearcherName());

        // Verify member_counter
        if (ExpeditionMember.member_counter == members.length) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("ERROR");
        }
    }
}

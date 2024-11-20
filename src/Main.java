import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize arrays of names and student IDs
        String[] allNames = {"Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona"};
        String[] allStudentIDs = {"S101", "S102", "S103", "S104", "S105", "S106"};

        // Step 2: Set up member pool
        ArrayList<ExpeditionMember> members = new ArrayList<>();
        int numberOfMembers = 4 + (int) (Math.random() * 3); // Randomly choose between 4 and 6 members
        for (int i = 0; i < numberOfMembers; i++) {
            members.add(new ExpeditionMember(allNames[i], allStudentIDs[i]));
        }

        // Step 3: Create expeditions
        ResearchExpedition pyramidExpedition = new ResearchExpedition(
                members.get(0), members.get(1), members.get(2));
        ResearchExpedition nileExpedition = new ResearchExpedition(
                members.get(members.size() - 3), members.get(members.size() - 2), members.get(members.size() - 1));

        // Step 4: Output and verification
        System.out.println("Pyramid Expedition Core Members:");
        System.out.println("Leader: " + pyramidExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + pyramidExpedition.getArchivistName());
        System.out.println("Field Researcher: " + pyramidExpedition.getFieldResearcherName());

        System.out.println("\nNile Expedition Core Members:");
        System.out.println("Leader: " + nileExpedition.getExpeditionLeaderName());
        System.out.println("Archivist: " + nileExpedition.getArchivistName());
        System.out.println("Field Researcher: " + nileExpedition.getFieldResearcherName());

        // Verify member_counter
        if (ExpeditionMember.member_counter == members.size()) {
            System.out.println("\nSUCCESS: member_counter matches the number of members.");
        } else {
            System.out.println("\nERROR: member_counter does not match the number of members.");
        }
    }
}

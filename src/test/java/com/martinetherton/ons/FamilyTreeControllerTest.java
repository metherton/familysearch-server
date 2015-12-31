package com.martinetherton.ons;

import org.junit.Test;

/**
 * Created by martin on 30/12/15.
 */
public class FamilyTreeControllerTest {

    @Test
    public void familyTreeShouldBeRequestedFromService() {
        FamilyTreeController controller = new FamilyTreeController();
        FamilyTree familyTree = controller.getFamilyTree();
    }

}

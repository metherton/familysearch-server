package com.martinetherton.ons;

import org.familysearch.api.client.ft.FamilySearchFamilyTree;
import org.gedcomx.links.Link;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 30/12/15.
 */
public class FamilyTreeControllerTest {

    @Test
    public void familyTreeShouldBeRequestedFromService() {
        List<Link> links = new ArrayList<Link>();
        FamilySearchFamilyTree tree = Mockito.mock(FamilySearchFamilyTree.class);
        Mockito.when(tree.getLinks()).thenReturn(links);
        FamilyTreeController controller = new FamilyTreeController(tree);
        FamilyTree expectedFamilyTree = new FamilyTree();

        FamilyTree familyTree = controller.getFamilyTree();
        Assert.assertThat(familyTree.getLinks().size(), Matchers.is(0));
    }

}

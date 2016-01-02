package com.martinetherton.ons;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 31/12/15.
 */
public class FamilyTreeTest {

    @Test
    public void gettersAndSetters() {
        FamilyTree tree = new FamilyTree();
        List<String> links = new ArrayList<String>();
        tree.setLinks(links);
        Assert.assertThat(tree.getLinks(), Matchers.is(links));
    }
}

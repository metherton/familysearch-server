package com.martinetherton.ons;

import org.familysearch.api.client.ft.FamilySearchFamilyTree;
import org.gedcomx.links.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 31/12/15.
 */
@RestController
public class FamilyTreeController {

    private FamilySearchFamilyTree tree;

    @Autowired
    public FamilyTreeController(FamilySearchFamilyTree tree) {
        this.tree = tree;
    }

    @RequestMapping(value="/familyTree", method = RequestMethod.GET)
    public FamilyTree getFamilyTree() {
        FamilyTree convertedTree = new FamilyTree();
        List<String> links = new ArrayList<String>();
        for(Link link: this.tree.getLinks()) {
            links.add(link.toString());
        }
        convertedTree.setLinks(links);
        return convertedTree;
    }

}

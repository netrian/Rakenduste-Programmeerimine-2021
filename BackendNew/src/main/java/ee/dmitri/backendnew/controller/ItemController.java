package ee.dmitri.backendnew.controller;

import ee.dmitri.backendnew.model.Item;
import ee.dmitri.backendnew.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("items")
    public List<Item> getItems() {

        return itemService.getItems();
    }

    @PostMapping("items")
    public String postItems(@RequestBody Item item) {
        itemService.saveItem(item);
        return "Item successfully posted  -  " + item.getName();
    }

    //restart server
    //localhost:8080/items


    //delete
    //edit
    //view one item

    //database



    //kodus:
    //categories
}

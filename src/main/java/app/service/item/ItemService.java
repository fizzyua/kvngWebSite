package app.service.item;

import app.entity.Item;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {
    boolean addItem(Item item);
    List<Item> getPagingListOfItems(Pageable pageable);
    List<Item> getPagingListOfItemsByFilters(Pageable pageable, String text);
}

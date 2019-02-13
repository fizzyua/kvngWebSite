package app.service.item;

import app.entity.Item;
import app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;


    @Override
    public boolean addItem(Item item) {
        if (itemRepository.findOne(item.getId()) != null) return false;
        itemRepository.save(item);
        return true;
    }

    @Override
    public List<Item> getPagingListOfItems(Pageable pageable) {
        return itemRepository.findAll(pageable).getContent();
    }

    @Override
    public List<Item> getPagingListOfItemsByFilters(Pageable pageable, String text) {
        return itemRepository.findAllByTitleContainingOrTextContainingOrArticleContaining(pageable,text,text,text);
    }
}

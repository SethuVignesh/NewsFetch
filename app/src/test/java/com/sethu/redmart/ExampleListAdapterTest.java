package com.sethu.redmart;

import com.sethu.redmart.data.ProductsItem;
import com.sethu.redmart.presentation.adapters.ProductListAdapter;
import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

public class ExampleListAdapterTest {
    private ProductListAdapter adapter;


    @Before
    public void setUp() throws Exception {
        adapter = new ProductListAdapter();

     }

    @Test
    public void itemCount() {
        ProductsItem productsItem = new ProductsItem();
        adapter.setProducts(asList(productsItem, productsItem, productsItem));

        assertEquals(adapter.getItemCount(), 3);
    }

    @Test
    public void getItemAtPosition() {
        ProductsItem firstItem = new ProductsItem();
        ProductsItem secondItem = new ProductsItem();
        adapter.setProducts(asList(firstItem, secondItem));
        assertEquals(adapter.getItemAtPos(0), firstItem);
        assertEquals(adapter.getItemAtPos(1), secondItem);
    }

}
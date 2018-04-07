package com.sethu.redmart.data;

/**
 * Created by sethugayu on 1/19/18.
 */

import java.util.List;



public class Products {
    private int onSaleCount;
    private int total;
    private Filters filters;
    private int page;
    private List<ProductsItem> products;
    private Facets facets;
    private Status status;
    private int pageSize;

    public void setOnSaleCount(int onSaleCount){
        this.onSaleCount = onSaleCount;
    }

    public int getOnSaleCount(){
        return onSaleCount;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return total;
    }

    public void setFilters(Filters filters){
        this.filters = filters;
    }

    public Filters getFilters(){
        return filters;
    }

    public void setPage(int page){
        this.page = page;
    }

    public int getPage(){
        return page;
    }

    public void setProducts(List<ProductsItem> products){
        this.products = products;
    }

    public List<ProductsItem> getProducts(){
        return products;
    }

    public void setFacets(Facets facets){
        this.facets = facets;
    }

    public Facets getFacets(){
        return facets;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public Status getStatus(){
        return status;
    }

    public void setPageSize(int pageSize){
        this.pageSize = pageSize;
    }

    public int getPageSize(){
        return pageSize;
    }

    @Override
    public String toString(){
        return
                "Products{" +
                        "on_sale_count = '" + onSaleCount + '\'' +
                        ",total = '" + total + '\'' +
                        ",filters = '" + filters + '\'' +
                        ",page = '" + page + '\'' +
                        ",products = '" + products + '\'' +
                        ",facets = '" + facets + '\'' +
                        ",status = '" + status + '\'' +
                        ",page_size = '" + pageSize + '\'' +
                        "}";
    }
}
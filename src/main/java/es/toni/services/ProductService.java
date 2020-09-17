package es.toni.services;

import es.toni.commands.ProductForm;
import es.toni.domain.Product;

public interface ProductService extends CRUDService<Product> {

    Product saveOrUpdateProductForm(ProductForm productForm);

}

/*
 * Copyright 2016 Jin Kwon &lt;onacit_at_gmail.com&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.example.northwind.persistence;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
@Entity
@Table(name = "Products")
public class Product {

    @Id
    @Column(name = "ProductID")
    private int productId;

    @Column(name = "ProductName")
    @NotNull
    private String productName;

    @ManyToOne
    @Column(name = "SupplierID")
    private Supplier supplier;

    @ManyToOne
    @Column(name = "CategoryID")
    private Category category;

    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;

    @Column(name = "UnitPrice", precision = 10, scale = 4)
    private BigDecimal unitPrice;

    @Column(name = "UnitsInStock")
    private Short unitsInStock;

    @Column(name = "UnitsInOrder")
    private Short unitsInOrder;

    @Column(name = "ReorderLevel")
    private Short reorderLevel;

    @Column(name = "Discontinued")
    private boolean dicontinued;
}

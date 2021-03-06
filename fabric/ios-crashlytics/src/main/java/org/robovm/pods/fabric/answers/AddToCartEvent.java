/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.pods.fabric.answers;

import java.math.BigDecimal;

import org.robovm.apple.foundation.NSDecimalNumber;

public final class AddToCartEvent extends AnswersEvent<AddToCartEvent> {
    protected NSDecimalNumber itemPrice;
    protected String currency;
    protected String itemName;
    protected String itemType;
    protected String itemId;

    public AddToCartEvent putItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public AddToCartEvent putItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public AddToCartEvent putItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public AddToCartEvent putItemPrice(BigDecimal itemPrice) {
        this.itemPrice = new NSDecimalNumber(String.valueOf(itemPrice));
        return this;
    }

    public AddToCartEvent putCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}

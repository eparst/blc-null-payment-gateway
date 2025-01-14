/*
 * #%L
 * BroadleafCommerce Framework Web
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package org.broadleafcommerce.vendor.nullPaymentGateway.service.payment;

import org.broadleafcommerce.common.payment.PaymentGatewayType;

/**
 * @author Elbert Bautista (elbertbautista)
 */
public class NullPaymentGatewayType extends PaymentGatewayType {

    public static final PaymentGatewayType NULL_GATEWAY  = new PaymentGatewayType("NULL_GATEWAY", "Null Payment Gateway Implementation");
    public static final PaymentGatewayType NULL_HOSTED_GATEWAY  = new PaymentGatewayType("NULL_HOSTED_GATEWAY", "Null Hosted Payment Gateway Implementation");


}

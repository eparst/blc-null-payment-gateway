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

package org.broadleafcommerce.vendor.nullPaymentGateway.web.expression;

import org.broadleafcommerce.common.payment.PaymentGatewayType;
import org.broadleafcommerce.common.payment.service.PaymentGatewayConfiguration;
import org.broadleafcommerce.common.web.payment.expression.AbstractPaymentGatewayFieldExtensionHandler;
import org.broadleafcommerce.common.web.payment.expression.PaymentGatewayFieldExtensionManager;
import org.broadleafcommerce.vendor.nullPaymentGateway.service.payment.NullPaymentGatewayConstants;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * This sample handler will add itself to the {@link PaymentGatewayFieldExtensionManager}
 * and will output the input NAMEs that are required by the
 * {@link org.broadleafcommerce.vendor.nullPaymentGateway.web.controller.mock.processor.NullMockProcessorController}
 *
 * Note, we don't want this loaded into the extension manager
 * if a real payment gateway is used, so make sure to not scan this class when
 * using a real implementation.
 *
 * In order to use this sample extension handler, you will need to component scan
 * the package "com.broadleafcommerce".
 *
 * This should NOT be used in production, and is meant solely for demonstration
 * purposes only.
 *
 * @author Elbert Bautista (elbertbautista)
 */
@Service("blNullPaymentGatewayFieldExtensionHandler")
public class NullPaymentGatewayFieldExtensionHandler extends AbstractPaymentGatewayFieldExtensionHandler {

    @Resource(name = "blPaymentGatewayFieldExtensionManager")
    protected PaymentGatewayFieldExtensionManager extensionManager;

    @Resource(name = "blNullPaymentGatewayConfiguration")
    protected PaymentGatewayConfiguration paymentGatewayConfiguration;

    @PostConstruct
    public void init() {
        if (isEnabled()) {
            extensionManager.registerHandler(this);
        }
    }

    @Override
    public String getCreditCardHolderName() {
        return NullPaymentGatewayConstants.CREDIT_CARD_NAME;
    }

    @Override
    public String getCreditCardType() {
        return null;
    }

    @Override
    public String getCreditCardNum() {
        return NullPaymentGatewayConstants.CREDIT_CARD_NUMBER;
    }

    @Override
    public String getCreditCardExpDate() {
        return NullPaymentGatewayConstants.CREDIT_CARD_EXP_DATE;
    }

    @Override
    public String getCreditCardExpMonth() {
        return null;
    }

    @Override
    public String getCreditCardExpYear() {
        return null;
    }

    @Override
    public String getCreditCardCvv() {
        return NullPaymentGatewayConstants.CREDIT_CARD_CVV;
    }

    @Override
    public String getBillToAddressFirstName() {
        return NullPaymentGatewayConstants.BILLING_FIRST_NAME;
    }

    @Override
    public String getBillToAddressLastName() {
        return NullPaymentGatewayConstants.BILLING_LAST_NAME;
    }

    @Override
    public String getBillToAddressCompanyName() {
        return NullPaymentGatewayConstants.BILLING_COMPANY_NAME;
    }

    @Override
    public String getBillToAddressLine1() {
        return NullPaymentGatewayConstants.BILLING_ADDRESS_LINE1;
    }

    @Override
    public String getBillToAddressLine2() {
        return NullPaymentGatewayConstants.BILLING_ADDRESS_LINE2;
    }

    @Override
    public String getBillToAddressCityLocality() {
        return NullPaymentGatewayConstants.BILLING_CITY;
    }

    @Override
    public String getBillToAddressStateRegion() {
        return NullPaymentGatewayConstants.BILLING_STATE;
    }

    @Override
    public String getBillToAddressPostalCode() {
        return NullPaymentGatewayConstants.BILLING_ZIP;
    }

    @Override
    public String getBillToAddressCountryCode() {
        return NullPaymentGatewayConstants.BILLING_COUNTRY;
    }

    @Override
    public String getBillToAddressPhone() {
        return NullPaymentGatewayConstants.BILLING_PHONE;
    }

    @Override
    public String getBillToAddressEmail() {
        return NullPaymentGatewayConstants.BILLING_EMAIL;
    }

    @Override
    public String getShipToAddressFirstName() {
        return null;
    }

    @Override
    public String getShipToAddressLastName() {
        return null;
    }

    @Override
    public String getShipToAddressCompanyName() {
        return null;
    }

    @Override
    public String getShipToAddressLine1() {
        return null;
    }

    @Override
    public String getShipToAddressLine2() {
        return null;
    }

    @Override
    public String getShipToAddressCityLocality() {
        return null;
    }

    @Override
    public String getShipToAddressStateRegion() {
        return null;
    }

    @Override
    public String getShipToAddressPostalCode() {
        return null;
    }

    @Override
    public String getShipToAddressCountryCode() {
        return null;
    }

    @Override
    public String getShipToAddressPhone() {
        return null;
    }

    @Override
    public String getShipToAddressEmail() {
        return null;
    }

    @Override
    public PaymentGatewayType getHandlerType() {
        return paymentGatewayConfiguration.getGatewayType();
    }
}

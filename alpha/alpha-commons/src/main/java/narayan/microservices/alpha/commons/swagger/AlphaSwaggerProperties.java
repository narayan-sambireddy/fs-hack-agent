package narayan.microservices.alpha.commons.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author narayana
 */
@Component
@ConfigurationProperties(prefix = "swagger")
public class AlphaSwaggerProperties {

    private String apiTitle;
    private String apiDescription;
    private String apiVersion;
    private String apiBasePackages;
    private String contactName;
    private String contactEmail;
    private String contactUrl;

    public String getApiTitle() {
        return apiTitle;
    }

    public void setApiTitle(String apiTitle) {
        this.apiTitle = apiTitle;
    }

    public String getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getApiBasePackages() {
        return apiBasePackages;
    }

    public void setApiBasePackages(String apiBasePackages) {
        this.apiBasePackages = apiBasePackages;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }
}

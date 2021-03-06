/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sibModel.SendEmailAttachment;

/**
 * SendEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-24T12:07:09.251+05:30")
public class SendEmail {
  @SerializedName("emailTo")
  private List<String> emailTo = new ArrayList<String>();

  @SerializedName("emailBcc")
  private List<String> emailBcc = null;

  @SerializedName("emailCc")
  private List<String> emailCc = null;

  @SerializedName("replyTo")
  private String replyTo = null;

  @SerializedName("attachmentUrl")
  private String attachmentUrl = null;

  @SerializedName("attachment")
  private List<SendEmailAttachment> attachment = null;

  @SerializedName("headers")
  private Object headers = null;

  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("tags")
  private List<String> tags = null;

  public SendEmail emailTo(List<String> emailTo) {
    this.emailTo = emailTo;
    return this;
  }

  public SendEmail addEmailToItem(String emailToItem) {
    this.emailTo.add(emailToItem);
    return this;
  }

   /**
   * List of the email addresses of the recipients. For example, [&#39;abc@example.com&#39;, &#39;asd@example.com&#39;].
   * @return emailTo
  **/
  @ApiModelProperty(required = true, value = "List of the email addresses of the recipients. For example, ['abc@example.com', 'asd@example.com'].")
  public List<String> getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(List<String> emailTo) {
    this.emailTo = emailTo;
  }

  public SendEmail emailBcc(List<String> emailBcc) {
    this.emailBcc = emailBcc;
    return this;
  }

  public SendEmail addEmailBccItem(String emailBccItem) {
    if (this.emailBcc == null) {
      this.emailBcc = new ArrayList<String>();
    }
    this.emailBcc.add(emailBccItem);
    return this;
  }

   /**
   * List of the email addresses of the recipients in bcc
   * @return emailBcc
  **/
  @ApiModelProperty(value = "List of the email addresses of the recipients in bcc")
  public List<String> getEmailBcc() {
    return emailBcc;
  }

  public void setEmailBcc(List<String> emailBcc) {
    this.emailBcc = emailBcc;
  }

  public SendEmail emailCc(List<String> emailCc) {
    this.emailCc = emailCc;
    return this;
  }

  public SendEmail addEmailCcItem(String emailCcItem) {
    if (this.emailCc == null) {
      this.emailCc = new ArrayList<String>();
    }
    this.emailCc.add(emailCcItem);
    return this;
  }

   /**
   * List of the email addresses of the recipients in cc
   * @return emailCc
  **/
  @ApiModelProperty(value = "List of the email addresses of the recipients in cc")
  public List<String> getEmailCc() {
    return emailCc;
  }

  public void setEmailCc(List<String> emailCc) {
    this.emailCc = emailCc;
  }

  public SendEmail replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Email address which shall be used by campaign recipients to reply back
   * @return replyTo
  **/
  @ApiModelProperty(example = "support@myshop.com", value = "Email address which shall be used by campaign recipients to reply back")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public SendEmail attachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
    return this;
  }

   /**
   * Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps
   * @return attachmentUrl
  **/
  @ApiModelProperty(example = "https://attachment.domain.com", value = "Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps")
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  public void setAttachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }

  public SendEmail attachment(List<SendEmailAttachment> attachment) {
    this.attachment = attachment;
    return this;
  }

  public SendEmail addAttachmentItem(SendEmailAttachment attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<SendEmailAttachment>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

   /**
   * Pass the list of content ( byte array which is encoded to base64 chunk data at our end ) and name of the attachment. For example, [{&#39;content&#39;:&#39;byte array content 1&#39;, &#39;name&#39;:&#39;attcahment1&#39;}, {&#39;content&#39;:&#39;byte array content 2&#39;, &#39;name&#39;:&#39;attcahment2&#39;}].
   * @return attachment
  **/
  @ApiModelProperty(value = "Pass the list of content ( byte array which is encoded to base64 chunk data at our end ) and name of the attachment. For example, [{'content':'byte array content 1', 'name':'attcahment1'}, {'content':'byte array content 2', 'name':'attcahment2'}].")
  public List<SendEmailAttachment> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<SendEmailAttachment> attachment) {
    this.attachment = attachment;
  }

  public SendEmail headers(Object headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Pass the set of headers that shall be sent along the mail headers in the original email. &#39;X-Mailin-IP&#39; header can be set (only for dedicated ip users) to mention the IP to be used for sending transactional emails. For example, {&#39;Content-Type&#39;:&#39;text/html&#39;, &#39;charset&#39;:&#39;iso-8859-1&#39;, &#39;X-Mailin-IP&#39;:&#39;1.2.3.4&#39;}
   * @return headers
  **/
  @ApiModelProperty(example = "{\"Content-Type\":\"text/html\",\"charset\":\"iso-8859-1\",\"X-Mailin-IP\":\"1.2.3.4\"}", value = "Pass the set of headers that shall be sent along the mail headers in the original email. 'X-Mailin-IP' header can be set (only for dedicated ip users) to mention the IP to be used for sending transactional emails. For example, {'Content-Type':'text/html', 'charset':'iso-8859-1', 'X-Mailin-IP':'1.2.3.4'}")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  public SendEmail attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Pass the set of attributes to customize the template. For example, {&#39;FNAME&#39;:&#39;Joe&#39;, &#39;LNAME&#39;:&#39;Doe&#39;}
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"FNAME\":\"Joe\",\"LNAME\":\"Doe\"}", value = "Pass the set of attributes to customize the template. For example, {'FNAME':'Joe', 'LNAME':'Doe'}")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public SendEmail tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SendEmail addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tag your emails to find them more easily
   * @return tags
  **/
  @ApiModelProperty(value = "Tag your emails to find them more easily")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendEmail sendEmail = (SendEmail) o;
    return ObjectUtils.equals(this.emailTo, sendEmail.emailTo) &&
    ObjectUtils.equals(this.emailBcc, sendEmail.emailBcc) &&
    ObjectUtils.equals(this.emailCc, sendEmail.emailCc) &&
    ObjectUtils.equals(this.replyTo, sendEmail.replyTo) &&
    ObjectUtils.equals(this.attachmentUrl, sendEmail.attachmentUrl) &&
    ObjectUtils.equals(this.attachment, sendEmail.attachment) &&
    ObjectUtils.equals(this.headers, sendEmail.headers) &&
    ObjectUtils.equals(this.attributes, sendEmail.attributes) &&
    ObjectUtils.equals(this.tags, sendEmail.tags);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailTo, emailBcc, emailCc, replyTo, attachmentUrl, attachment, headers, attributes, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmail {\n");
    
    sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
    sb.append("    emailBcc: ").append(toIndentedString(emailBcc)).append("\n");
    sb.append("    emailCc: ").append(toIndentedString(emailCc)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


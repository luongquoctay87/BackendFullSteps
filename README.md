# Send Email

## 1. Gửi simple email

## 2. Gửi email với template HTML

## 3. Gửi email với SendGrid
#### 1. SendGrid là gì?
`SendGrid` là một nền tảng Email as a Service (EaaS) giúp gửi email với độ tin cậy cao, có khả năng mở rộng và dễ tích hợp với các ứng dụng web và di động. SendGrid xử lý tất cả các khía cạnh của việc gửi email từ cơ sở hạ tầng, tối ưu hóa khả năng giao hàng (deliverability), quản lý danh sách liên hệ, đến báo cáo chi tiết về hiệu suất.

SendGrid hỗ trợ gửi nhiều loại email:
- Email giao dịch: Những email như xác nhận đơn hàng, email reset mật khẩu, biên nhận, thông báo tài khoản, v.v.
- Email tiếp thị: Những chiến dịch email quảng cáo, thông báo giảm giá, email chăm sóc khách hàng, v.v.

#### 2. Các tính năng chính của SendGrid
SendGrid cung cấp rất nhiều tính năng giúp gửi email trở nên dễ dàng và hiệu quả:

**a. Gửi email hàng loạt**
SendGrid cho phép bạn gửi hàng triệu email mỗi ngày mà không gặp vấn đề về giới hạn tốc độ hoặc hiệu suất. Với khả năng mở rộng, bạn có thể dễ dàng quản lý khối lượng lớn email mà không cần lo lắng về hạ tầng.

**b. API mạnh mẽ**
SendGrid cung cấp một RESTful API dễ sử dụng, cho phép tích hợp vào các ứng dụng web, di động hoặc phần mềm của bạn. Điều này giúp việc gửi email từ ứng dụng của bạn trở nên đơn giản hơn. Các API chính của SendGrid bao gồm:

- Mail API: Gửi email một cách đơn giản và linh hoạt.
- Marketing API: Quản lý chiến dịch tiếp thị email.
- Event Webhooks: Theo dõi và phản hồi các sự kiện email như email đã mở, email đã bị từ chối, nhấp vào liên kết, v.v.
  
**c. Tối ưu hóa khả năng giao hàng (Deliverability)**
Một trong những điểm mạnh của SendGrid là khả năng tối ưu hóa tỷ lệ email đến được hộp thư chính (inbox). SendGrid sử dụng các kỹ thuật tối ưu hóa như xác thực email (DKIM, SPF), quản lý danh sách đen (blacklist), và giám sát khả năng phân phối để đảm bảo email không bị gửi vào thư mục spam.

**d. Báo cáo chi tiết**
SendGrid cung cấp các báo cáo chi tiết về hiệu suất của từng email bạn gửi đi, bao gồm:

- Số lần mở email
- Số lần nhấp vào liên kết 
- Email bị trả lại (bounced)
- Email bị đánh dấu là spam 
- Các email không đến được hộp thư chính (delivered)

**e. Quản lý danh sách liên hệ**
SendGrid cung cấp công cụ quản lý danh sách liên hệ, cho phép bạn tổ chức và quản lý đối tượng nhận email theo các tiêu chí khác nhau, từ đó cá nhân hóa nội dung email hoặc phân chia chiến dịch marketing một cách hiệu quả.

**f. Thiết kế email**
SendGrid cung cấp giao diện trực quan để bạn có thể tạo và thiết kế các mẫu email chuyên nghiệp mà không cần nhiều kiến thức về mã hóa. Ngoài ra, nó hỗ trợ thiết kế email HTML tùy chỉnh cho các lập trình viên.

**g. Chống spam và tuân thủ quy định**
SendGrid tuân thủ các quy định liên quan đến việc gửi email như CAN-SPAM Act của Hoa Kỳ và GDPR của Liên minh Châu Âu, giúp bạn gửi email hợp pháp và tránh bị đánh dấu là spam.

#### 3. Tại sao nên sử dụng SendGrid?
SendGrid cung cấp nhiều lợi ích so với việc tự triển khai một hệ thống gửi email riêng:
- Khả năng mở rộng: SendGrid có thể xử lý từ vài email đến hàng triệu email mỗi ngày mà không ảnh hưởng đến hiệu suất.
- Độ tin cậy cao: Với cơ sở hạ tầng mạnh mẽ và các kỹ thuật tối ưu hóa khả năng giao hàng, SendGrid đảm bảo tỷ lệ gửi email thành công cao.
- Dễ tích hợp: Với API linh hoạt và các thư viện hỗ trợ nhiều ngôn ngữ lập trình, việc tích hợp SendGrid vào các ứng dụng hiện có rất dễ dàng.
- Phân tích chi tiết: Báo cáo chi tiết giúp bạn theo dõi hiệu quả của chiến dịch và điều chỉnh nội dung để tăng hiệu suất.
- Tính bảo mật và tuân thủ: SendGrid tuân thủ các tiêu chuẩn bảo mật cao, giúp bạn bảo vệ thông tin người dùng và tuân thủ các quy định pháp lý.

#### 4. Cách thức hoạt động của SendGrid
SendGrid hoạt động theo một quy trình đơn giản:
- Tích hợp: Bạn tích hợp API của SendGrid vào ứng dụng của mình để gửi email. API hỗ trợ nhiều ngôn ngữ lập trình như Java, Python, Node.js, PHP, Ruby, v.v.
- Gửi email: Sử dụng các phương thức API để gửi email giao dịch hoặc tiếp thị đến danh sách người nhận.
- Theo dõi & Báo cáo: SendGrid sẽ theo dõi trạng thái của email (như đã mở, đã nhấp, hoặc bị trả lại) và cung cấp các báo cáo chi tiết thông qua bảng điều khiển hoặc webhook.

#### 5. Các gói dịch vụ của SendGrid
SendGrid cung cấp nhiều gói dịch vụ khác nhau để phù hợp với nhu cầu của mọi loại hình doanh nghiệp:
- Gói miễn phí: Cho phép gửi 100 email/ngày miễn phí, phù hợp với các dự án nhỏ hoặc cho mục đích thử nghiệm.
- Gói trả phí: Có nhiều cấp độ khác nhau tùy thuộc vào số lượng email bạn cần gửi hàng tháng, với nhiều tính năng nâng cao như phân tích chuyên sâu, hỗ trợ khách hàng ưu tiên, và API nâng cao.

#### 6. Một số trường hợp sử dụng phổ biến của SendGrid
- Email giao dịch: Được dùng để gửi các email xác nhận đơn hàng, thông báo tài khoản, đặt lại mật khẩu, v.v. 
- Chiến dịch tiếp thị qua email: Gửi email quảng cáo, thông báo giảm giá, tin tức công ty, hoặc lời mời tham gia sự kiện. 
- Theo dõi hành vi người dùng: SendGrid có thể được tích hợp vào các ứng dụng để gửi email tự động dựa trên hành vi người dùng (ví dụ: gửi email sau khi người dùng đăng ký, mua hàng hoặc không hoạt động một thời gian dài).

#### 7. Hạn chế của SendGrid
- Chi phí: Mặc dù SendGrid cung cấp gói miễn phí, chi phí có thể tăng lên đáng kể nếu bạn cần gửi một lượng lớn email hoặc cần sử dụng các tính năng nâng cao. 
- Giới hạn về thiết kế email: Mặc dù SendGrid có giao diện thiết kế email dễ sử dụng, nó vẫn có những hạn chế nhất định về tính linh hoạt trong tùy biến các mẫu email phức tạp.

#### 8. Các dịch vụ tương tự
- Amazon SES (Simple Email Service)
- Mailgun 
- Postmark 
- SparkPost
Mỗi dịch vụ đều có điểm mạnh riêng, nhưng SendGrid nổi bật với giao diện thân thiện, dễ sử dụng và khả năng tích hợp API mạnh mẽ.

## 4. Tích hợp SendGrid với Spring Boot
##### Bước 1: Thiết lập tài khoản SendGrid
- Tạo tài khoản SendGrid: Đăng ký một tài khoản trên trang web SendGrid.
- Tạo API Key:
  - Sau khi đăng nhập, vào phần "API Keys" trong dashboard của SendGrid. 
  - Tạo một API key và lưu lại để sử dụng trong ứng dụng Spring Boot.

##### Bước 2: Cấu hình ứng dụng Spring Boot
Để tích hợp SendGrid vào Spring Boot, bạn cần thêm thư viện của SendGrid và cấu hình API key của mình.

**a. Thêm dependency vào pom.xml**
```xml
<dependency>
    <groupId>com.sendgrid</groupId>
    <artifactId>sendgrid-java</artifactId>
    <version>4.9.3</version>
</dependency>
```

**b. Cấu hình API Key trong application.yml**
```yml
spring:
  sendgrid:
    apiKey: YOUR_SENDGRID_API_KEY
```

**c. Tạo cấu hình SendGrid trong Spring Boot**
```java
import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendGridConfig {

    @Value("${spring.sendgrid.apiKey}")
    private String sendGridApiKey;

    @Bean
    public SendGrid sendGrid() {
        return new SendGrid(sendGridApiKey);
    }
}
```

##### Bước 3: Tạo Service để gửi email
Tiếp theo, tạo một service để gửi email sử dụng API của SendGrid.
```java
import com.sendgrid.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailService {

    @Autowired
    private SendGrid sendGrid;

    public String sendEmail(String toEmail, String subject, String body) {
        Email from = new Email("your_email@example.com"); // Email của bạn
        Email to = new Email(toEmail);

        Content content = new Content("text/plain", body);
        Mail mail = new Mail(from, subject, to, content);

        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sendGrid.api(request);

            // Kiểm tra kết quả phản hồi từ SendGrid
            if (response.getStatusCode() == 202) {
                return "Email sent successfully!";
            } else {
                return "Failed to send email: " + response.getBody();
            }

        } catch (IOException e) {
            return "Error occurred while sending email: " + e.getMessage();
        }
    }
}
```

##### Bước 4: Sử dụng API để gửi email
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String body) {
        return emailService.sendEmail(toEmail, subject, body);
    }
}
```

##### Bước 5: Test ứng dụng
http://localhost:8080/send-email?toEmail=test@example.com&subject=Hello&body=This is a test email









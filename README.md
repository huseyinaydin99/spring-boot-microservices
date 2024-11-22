### Microservices çalışmamdır.

### Proje Özeti:
Java 17, Spring Boot, Apache Kafka, RabbitMQ, MongoDB, PostgreSQL, Docker, Docker Compose, Zipkin, Kubernetes ve AWS teknolojilerini kullanarak geliştirilen bir mikroservis projesidir. Bu proje, dağıtık bir mimari üzerinde yüksek performanslı, ölçeklenebilir ve dayanıklı bir sistem oluşturmayı hedeflemiştir.

### Microservice Proje Şeması:
![microservice_schema](https://github.com/user-attachments/assets/5ae1ac1d-0923-4f97-b902-057224c0ea3b)

### Mikroservis Mimarisi:
Proje, bağımsız olarak dağıtılabilen ve yönetilebilen mikroservislerden oluşmaktadır. Her mikroservis, belirli bir işlevi yerine getirir ve diğer mikroservislerle haberleşir.

### Veri Akışı Yönetimi:
Apache Kafka ve RabbitMQ kullanılarak yüksek hacimli veri akışı ve mesajlaşma işlemleri yönetilmiştir. Bu sayede, sistemin yüksek trafikli işlemleri sorunsuz bir şekilde karşılaması sağlanmıştır.

### Veri Depolama:
MongoDB ve PostgreSQL ile hem NoSQL hem de ilişkisel veritabanı ihtiyaçları karşılanmıştır. MongoDB, esnek veri yapıları için kullanılırken, PostgreSQL daha karmaşık ve ilişkisel veri işlemleri için tercih edilmiştir.

### Konteynerleştirme:
Docker ile mikroservisler konteynerleştirilmiş ve Docker Compose ile bu konteynerler kolayca yönetilmiştir.

### Orkestrasyon ve İzleme:
Kubernetes kullanılarak mikroservislerin orkestrasyonu sağlanmış ve Zipkin ile dağıtık izleme yapılmıştır.

### Bulut Entegrasyonu:
AWS kullanılarak projenin bulut üzerinde dağıtımı ve yönetimi gerçekleştirilmiştir. Bu sayede, sistemin ölçeklenebilirliği ve erişilebilirliği artırılmıştır.

### Projedeki Rolüm:
Proje kapsamında, yazılım geliştirme süreçlerinin yanı sıra mikroservis mimarisinin tasarımı, veri akışı ve mesajlaşma sistemlerinin entegrasyonu, veri tabanı yönetimi, konteynerleştirme ve bulut altyapısının yönetimi gibi kritik görevlerde aktif rol aldım. Ayrıca, performans izleme ve iyileştirme çalışmaları ile sistemin güvenilirliğini ve sürdürülebilirliğini sağladım.

### Görseller(Projede arayüz bulunmamaktadır.)
![project (1)](https://github.com/user-attachments/assets/74196e92-d934-47c5-906f-4ec80e2c7e77)
![project (2)](https://github.com/user-attachments/assets/092889d1-fed5-4e29-9c3d-72e3b6326ab4)
![project (3)](https://github.com/user-attachments/assets/17f3a880-f9b3-40f1-a898-0398482eed31)
![project (4)](https://github.com/user-attachments/assets/2add21c9-b618-4724-8ea6-678301568d08)
![project (5)](https://github.com/user-attachments/assets/b0f8299d-47c8-42ee-9511-a5ed4a8417fd)
![project (6)](https://github.com/user-attachments/assets/b615eabf-00d2-4636-9273-43f09b93d4c5)
![project (7)](https://github.com/user-attachments/assets/87726ab1-38ae-49df-85be-d83507a141ec)
![project (8)](https://github.com/user-attachments/assets/649495cf-29fd-45e0-a1be-ba6b3609728b)
![project (9)](https://github.com/user-attachments/assets/959bc5d3-4d85-4df3-bba1-287a9ec6eea9)
![project (10)](https://github.com/user-attachments/assets/43789b64-8874-4c8c-aa5d-e3974b4e5dda)
![project (11)](https://github.com/user-attachments/assets/980d8b09-726f-4218-b4fc-9eedd91b7a1f)
![project (12)](https://github.com/user-attachments/assets/28bdf538-5313-42b9-a92a-df6acb5ebb7e)
![project (13)](https://github.com/user-attachments/assets/f9cd40c3-4ba3-4f95-8076-bd219c222028)

### Kullanılan Teknolojiler ve Araçlar:
#### •Java 17:
Modern Java özellikleri ile performans ve kod kalitesini artırmak için.
#### •Spring Boot:
Hızlı ve etkin bir şekilde mikroservisler geliştirmek için.
#### •Apache Kafka:
Yüksek verimli veri akışı ve gerçek zamanlı veri işleme için.
#### •RabbitMQ:
Mesaj kuyruğu ve asenkron iletişim sağlamak için.
#### •MongoDB:
NoSQL veri tabanı kullanarak esnek ve ölçeklenebilir veri depolama çözümleri için.
#### •PostgreSQL:
İlişkisel veri tabanı yönetimi ve karmaşık sorgular için.
#### •Docker:
Uygulamaların konteynerleştirilmesi ve her ortamda tutarlı çalışmasını sağlamak için.
#### •Docker Compose:
Çoklu konteyner uygulamalarını kolayca yönetmek için.
#### •Kubernetes:
Mikroservislerin orkestrasyonu ve otomatik ölçeklendirme için.
#### •AWS (Amazon Web Services):
Bulut altyapısı, depolama ve dağıtık sistemlerin barındırılması için.
#### •API Gateway:
Giriş kapısı olarak kullanılarak gelen istekleri yönlendirmek ve güvenlik sağlamak için kullanıldı.
#### •Load Balancer:
Yük dengesini sağlamak ve hizmet kesintilerini en aza indirmek için kullanıldı.
#### •Fraud Service:
Dolandırıcılık algılama ve önleme hizmeti olarak kullanıldı, müşteri işlemlerinde güvenliği artırmak için entegre edildi.
#### •Customer Service:
Müşteri verilerini yönetmek ve işlemleri gerçekleştirmek için kullanıldı.
#### •Private Docker Registry:
Güvenlik ve özel depolama ihtiyaçlarını karşılamak için kullanıldı, konteyner tabanlı uygulama dağıtımını yönetmek için kullanıldı.
#### •Eureka Server:
Servis keşfi ve yük dengeleme için kullanıldı, hizmetlerin otomatik olarak bulunmasını ve yönlendirilmesini sağladı.
#### •Config Server:
Uygulama yapılandırma yönetimi için kullanıldı, dinamik yapılandırma değişikliklerini kolaylaştırdı.
#### •Zipkin:
Dağıtılmış sistemlerdeki hizmetler arası etkileşimleri izlemek ve analiz etmek için kullanıldı, performans sorunlarını tespit etmek ve geliştirmek için kullanıldı.

### Proje Detayları:
Bu projede, bir dizi önde gelen teknolojiyi kullanarak kapsamlı bir altyapı geliştirdim. Bu altyapı, API yönlendirme ve güvenliği için bir giriş kapısı sağladı, yük dengesi sağlayarak hizmet kesintilerini minimize etti, müşteri işlemlerinde dolandırıcılığı tespit etmek ve önlemek için bir mikro hizmet entegre ettim, konteyner tabanlı uygulama dağıtımını yönetmek için özel Docker Compose'u kullandım, servis keşfi(discovery) ve yük dengeleme için bir Eureka sunucusu entegre ettim, uygulama yapılandırma yönetimi için bir Yapılandırma Sunucusu(config server) kurdum ve dağıtılmış sistemlerdeki hizmetler arası etkileşimleri izlemek ve analiz etmek için Zipkin'i kullandım.

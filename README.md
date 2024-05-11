# **Resilience4j - Retry**
## Thiết lập retry sau 10s gọi 1 lần và gọi tối đa 5 lần:

![image](https://github.com/yennhii134/TranThiYenhi_KT-TKPM_Tuan07/assets/92464791/98edb6c2-8aed-4ff5-b811-fdef5e09c49b)

## Bước 1: Get UesrService from OrderService:

![image](https://github.com/yennhii134/TranThiYenhi_KT-TKPM_Tuan07/assets/92464791/01182b71-d914-433d-b08a-f6dfefb74d80)

### Sau khi gọi, ghi nhận lần gọi đầu tiên:

![image](https://github.com/yennhii134/TranThiYenhi_KT-TKPM_Tuan07/assets/92464791/bf10bd6c-720f-45ff-bfc5-8ca9e7f88180)

## Bước 2: End UserService:

![image](https://github.com/yennhii134/TranThiYenhi_KT-TKPM_Tuan07/assets/92464791/2d605ad4-0b37-45fa-81f0-8cd7a2a2e1d7)

### Sau khi end UserSerivice, OrderService tiếp tục gọi 10s/1 lần và gọi thêm 5 lần nữa:

![image](https://github.com/yennhii134/TranThiYenhi_KT-TKPM_Tuan07/assets/92464791/6826d083-28a0-446a-b574-0925dfd7d1df)

### Khi đã gọi quá 5 lần không có phản hồi, OrderService báo ERROR lúc 03:25:15 khớp với thời gian Web báo ERROR:

![image](https://github.com/yennhii134/TranThiYenhi_KT-TKPM_Tuan07/assets/92464791/966dbf87-8bd9-4a47-a471-62fa134cd41e)

## Vậy Retry đã được thực hiện gọi 10s/1 lần và đã gọi 5 lần sau đó kết thúc.



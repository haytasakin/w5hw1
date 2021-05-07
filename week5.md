# w5hw1

Derste Aldığım notlarla 

--------Entities----------------------------==>Varlık: Yani buraya yazdığımız şey User-Product gibi katılı nesneler.Her grupla bağlantı kurabilir.
---DataAccess:----------<=======>-----------------Business------------------<==========>---------Arayüz                     
-Veriye erişim dışında            - İş yapan kodlar buraya yazılır.
kod yazılmaz.                     -Hem DataAccess hem arayüze bağlantılıdır.
-Burdaki örneğimizde              -Bu örnekte UserService(abs)UserManager(conc)
UserDao(I)-HibernateUserDao        

yapılan şeyler:                   yapılan şeyler:
1-kayıtın Arraye eklenmesi        1-kayıt olurkenki şartların kontrolü
2-Email kullanılıp kullanıl-       olumlu-olumsuz durumların kullanıcıya bildirilmesi.
madığının bakma                   2-Kayıt başarılıysa dataAccess ile bağlantı kurup 
                                   Arraye ekleme.
3-Giriş yaparken kayıtlı          3-Giriş yapan kodların kontrolü      
arrayde olup olmadığı.

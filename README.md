# cordova-adapter - 安卓原生应用嵌入ionic/cordova  
平台:Android
minSdkVersion:19
工具:Android Studio
1


## 使用方法:  
1.在Project的build.gradle中加入JitPack仓库,加在allprojects下面,buildscript中不要加
       
    allprojects {
      repositories {
          ...
          maven { url 'https://jitpack.io' }
      }
    }

2.在app的build.gradle中加入以下代码  
    
    dependencies {
        ...
        implementation 'com.github.macrine:cordova-adapter:2.2'
        ...
    }
完成后同步一下

3.将ionic项目build安卓平台后的assets/www文件夹放到服务器上,得到一个url  

4.在java代码中调用:  
```
Intent intent=new Intent(MainActivity.this,CordovaViewerActivity.class);
intent.putExtra("url","https://url);
startActivity(intent);
```

MainActivity是当前的Activity
https://url 是第3步得到的url


## 支持的cordova插件  
>1.Device,cordova-plugin-device  
>2.cordova-plugin-ionic-keyboard  
>3.cordova-plugin-camera

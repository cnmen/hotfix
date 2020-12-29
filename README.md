### If you don't know, please click here : [CmonBaby](https://www.cmonbaby.com)

## Hotfix ![Build Status](https://travis-ci.org/greenrobot/EventBus.svg?branch=master)

## About Hotfix Code

#### * find sourceFile
```java
// initAccessToken();
File sourceFile = new File(Environment.getExternalStorageDirectory(), Constants.DEX_NAME);
```

#### * find targetFile
```java
File targetFile = new File(getDir(Constants.DEX_DIR, Context.MODE_PRIVATE).getAbsolutePath()
                + File.separator + Constants.DEX_NAME);
```

#### * copy dex file
```java
FileUitls.copyFile(sourceFile, targetFile);
```

#### * start fix
```java
FixDexUtils.loadFixedDex(this);
```

Via Gradle:
```gradle
implementation 'com.cmonbaby:hotfix:1.0.0'
```

Via Maven:
```xml
<dependency>
    <groupId>com.cmonbaby</groupId>
    <artifactId>hotfix</artifactId>
    <version>1.0.0</version>
</dependency>
```

## License

Copyright (C) 2013-2020 Markus Junginger, Simon (https://www.cmonbaby.com)
Hotfix binaries and source code can be used according to the [Apache License, Version 2.0](LICENSE).

# FileUtils
传入参数为文件路径，返回一个byte[] 类型

#提供三种方法：

###toByteArray(String filename)    the traditional io way 
###toByteArray2(String filename)    NIO way
###toByteArray3(String filename)    Mapped File  way    MappedByteBuffer 可以在处理大文件时，提升性能
 

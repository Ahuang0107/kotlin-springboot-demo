# Todo List

* [ ] what exactly I need to test?
* [ ] 之前对于外键关联，如果实体上只存关联的外键，会导致查询数据时需要查两遍然后再将数据合并到一个对象上返回，这是麻烦的点。目前小明使用的新的解决方案是，使用provider自动通过service来获取外键关联的对象。
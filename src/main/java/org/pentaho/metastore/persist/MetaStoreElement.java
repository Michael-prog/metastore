package main.org.pentaho.metastore.persist;

public @interface MetaStoreElement {
  MetaStoreElementType elementType();

  String name();
}

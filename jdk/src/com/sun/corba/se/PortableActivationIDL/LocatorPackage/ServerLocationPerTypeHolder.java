package com.sun.corba.se.PortableActivationIDL.LocatorPackage;

/**
* com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/ec2-user/workspace/Corretto8/macos/x64/build/Corretto8Src/installers/mac/tar/corretto-build/buildRoot/src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, October 14, 2021 9:08:58 PM GMT
*/

public final class ServerLocationPerTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType value = null;

  public ServerLocationPerTypeHolder ()
  {
  }

  public ServerLocationPerTypeHolder (com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerTypeHelper.type ();
  }

}

/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 26 17:32:44 GMT 2020
 */

package com.google.common.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Files_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.io.Files"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9c/2fm2fk412pj9zjkzvdx9w2fr0000gn/T/"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/Users/joaocorreia/guava/guava"); 
    java.lang.System.setProperty("user.home", "/Users/joaocorreia"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "joaocorreia"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Files_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.io.ByteStreams$1",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.io.Closer$Suppressor",
      "com.google.common.base.JdkPattern",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.math.IntMath",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.collect.FluentIterable",
      "com.google.common.base.Optional",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.graph.Network",
      "com.google.common.io.CharStreams$NullWriter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.base.CommonPattern",
      "com.google.common.io.ByteSink",
      "com.google.common.collect.Iterators$10",
      "com.google.common.hash.Funnel",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.collect.TreeTraverser$PostOrderIterator",
      "com.google.common.io.ByteStreams",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.io.ByteSink$AsCharSink",
      "com.google.common.base.Joiner",
      "com.google.common.io.CharSource$CharSequenceCharSource",
      "com.google.common.io.ByteProcessor",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.base.Strings",
      "com.google.common.collect.TreeTraverser$PreOrderIterator",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.io.Closer",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.io.ByteArrayDataInput",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.io.ByteSource",
      "com.google.common.hash.Hasher",
      "com.google.common.io.Files$FilePredicate$1",
      "com.google.common.io.Files$FilePredicate$2",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.graph.PredecessorsFunction",
      "com.google.common.hash.HashCode",
      "com.google.common.io.CharSource$StringCharSource",
      "com.google.common.io.Files$FilePredicate",
      "com.google.common.hash.Funnels$SinkAsStream",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.CharMatcher",
      "com.google.common.io.FileWriteMode",
      "com.google.common.base.Throwables",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.io.ByteSource$EmptyByteSource",
      "com.google.common.graph.Traverser",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.io.ByteSource$AsCharSource",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.io.Closer$SuppressingSuppressor",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.io.Files$2",
      "com.google.common.io.Files$3",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.io.Files$1",
      "com.google.common.io.AppendableWriter",
      "com.google.common.io.Files$FileByteSink",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.errorprone.annotations.Immutable",
      "com.google.common.io.CharStreams",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.io.ByteArrayDataOutput",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.errorprone.annotations.DoNotMock",
      "com.google.common.io.LineReader$1",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.io.ByteSource$SlicedByteSource",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.graph.Traverser$GraphTraverser",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.graph.Traverser$TreeTraverser",
      "com.google.common.collect.Iterators$1",
      "com.google.common.io.ByteStreams$LimitedInputStream",
      "com.google.common.collect.Iterators$4",
      "com.google.common.hash.Funnels",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.TreeTraverser$1",
      "com.google.common.collect.TreeTraverser$2",
      "com.google.common.collect.TreeTraverser$3",
      "com.google.common.collect.TreeTraverser$4",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.hash.HashFunction",
      "com.google.common.base.Splitter$Strategy",
      "com.google.common.collect.Lists$1",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.io.CharSource$EmptyCharSource",
      "com.google.common.io.LineBuffer",
      "com.google.common.io.CharSource$ConcatenatedCharSource",
      "com.google.common.io.CharSink",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.TreeTraverser",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.collect.ImmutableList",
      "com.google.common.io.Files",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.io.Files$FileByteSource",
      "com.google.common.io.CharSource$AsByteSource",
      "com.google.common.io.CharSource",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.io.LineProcessor",
      "com.google.common.graph.BaseGraph",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.io.ByteSource$ByteArrayByteSource",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.io.ByteSource$ConcatenatedByteSource",
      "com.google.common.base.AbstractIterator",
      "com.google.common.io.LineReader",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.graph.SuccessorsFunction"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.common.hash.HashFunction", false, Files_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.common.hash.Hasher", false, Files_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.common.io.ByteProcessor", false, Files_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.common.io.LineProcessor", false, Files_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.io.OutputStream", false, Files_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.nio.channels.FileChannel$MapMode", false, Files_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.nio.charset.Charset", false, Files_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Files_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.TreeTraverser",
      "com.google.common.io.Files$2",
      "com.google.common.io.Files$3",
      "com.google.common.io.Files",
      "com.google.common.io.ByteSource",
      "com.google.common.io.Files$FileByteSource",
      "com.google.common.io.ByteSink",
      "com.google.common.io.Files$FileByteSink",
      "com.google.common.io.Files$1",
      "com.google.common.io.FileWriteMode",
      "com.google.common.io.Closer$SuppressingSuppressor",
      "com.google.common.io.Closer$LoggingSuppressor",
      "com.google.common.io.Closer",
      "com.google.common.io.Files$FilePredicate",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Throwables",
      "com.google.common.hash.Funnels",
      "com.google.common.hash.Funnels$SinkAsStream",
      "com.google.common.io.CharSource",
      "com.google.common.io.ByteSource$AsCharSource",
      "com.google.common.collect.Lists",
      "com.google.common.graph.Traverser",
      "com.google.common.graph.Traverser$TreeTraverser",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.io.CharSink",
      "com.google.common.io.ByteSink$AsCharSink",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.base.Joiner",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.base.Strings",
      "com.google.common.io.CharStreams",
      "com.google.common.io.LineReader",
      "com.google.common.io.LineBuffer",
      "com.google.common.io.LineReader$1",
      "com.google.common.io.ByteStreams$1",
      "com.google.common.io.ByteStreams",
      "com.google.common.io.AppendableWriter"
    );
  }
}

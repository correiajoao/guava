/*
* This file was automatically generated by EvoSuite
* Wed Feb 26 20:53:49 GMT 2020
*/

package com.google.common.net;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class InternetDomainName_ESTest extends InternetDomainName_ESTest_scaffolding {


    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o construtor de InternetDomainName com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        InternetDomainName internetDomainName0 = null;
        try {
            internetDomainName0 = new InternetDomainName("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0DE6\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1A80\u1A90\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uA9D0\uA9F0\uAA50\uABF0\uFF10");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Not a valid domain name: '0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0DE6\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1A80\u1A90\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uA9D0\uA9F0\uAA50\uABF0\uFF10'
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o método from() com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Undeclared exception!
        try {
            InternetDomainName.from("\u2002\u3000\r\u0085\u200A\u2005\u2000\u3000\u2029\u000B\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\u00A0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Not a valid domain name: '\u2002\u3000\r\u0085\u200A\u2005\u2000\u3000\u2029\u000B\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\u00A0\f\u2009\u3000\u2004\u3000\u3000\u2028
            // \u2007\u3000'
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o método parent() com parâmetros inválidos lança uma IllegalStateException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        InternetDomainName internetDomainName0 = new InternetDomainName("u");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("u", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());

        // Undeclared exception!
        try {
            internetDomainName0.parent();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // Domain 'u' has no parent
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o método isValid() com parâmetros inválidos lança uma NullPointerException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Undeclared exception!
        try {
            InternetDomainName.isValid((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o método from() com parâmetros inválidos lança uma NullPointerException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Undeclared exception!
        try {
            InternetDomainName.from((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o método child() com parâmetros inválidos lança uma NullPointerException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        InternetDomainName internetDomainName0 = new InternetDomainName("l");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertEquals("l", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());

        // Undeclared exception!
        try {
            internetDomainName0.child((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }


    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     o construtor de InternetDomainName com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        InternetDomainName internetDomainName0 = null;
        try {
            internetDomainName0 = new InternetDomainName((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.CharMatcher", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("com.google.common.collect.Hashing");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());

        boolean boolean0 = internetDomainName0.hasParent();
        assertTrue(boolean0);
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("d");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertEquals("d", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());

        boolean boolean0 = internetDomainName0.isTopDomainUnderRegistrySuffix();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertEquals("d", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("com.google.common.collect.Hashing");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());

        boolean boolean0 = internetDomainName0.hasRegistrySuffix();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("C");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());

        boolean boolean0 = internetDomainName0.isTopPrivateDomain();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("com.google.common.collect.Hashing");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());

        boolean boolean0 = internetDomainName0.isUnderPublicSuffix();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("C");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isPublicSuffix());

        boolean boolean0 = internetDomainName0.hasPublicSuffix();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isPublicSuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test13() throws Throwable {
        InternetDomainName internetDomainName0 = new InternetDomainName("l");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertEquals("l", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());

        boolean boolean0 = internetDomainName0.equals("");
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertEquals("l", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste possui similaridade com os testes 7, 8, 9, 10, 11, 12 e
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são em parte compreesíveis.
    */
    @Test(timeout = 4000)
    public void test14() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("d");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("d", internetDomainName0.toString());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());

        boolean boolean0 = internetDomainName0.hasParent();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("d", internetDomainName0.toString());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     a chamada do método topDomainUnderRegistrySuffix () com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test15() throws Throwable {
        InternetDomainName internetDomainName0 = new InternetDomainName("p");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("p", internetDomainName0.toString());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());

        // Undeclared exception!
        try {
            internetDomainName0.topDomainUnderRegistrySuffix();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // Not under a registry suffix: p
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste possui similaridade com os testes 7, 8, 9, 10, 11, 12, 13, 14 e 15.
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são em parte compreesíveis.
    */
    @Test(timeout = 4000)
    public void test16() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("C");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());

        boolean boolean0 = internetDomainName0.isUnderRegistrySuffix();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste possui similaridade com os testes 7, 8, 9, 10, 11, 12, 13, 14, 15 e 16.
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são em parte compreesíveis.
    */
    @Test(timeout = 4000)
    public void test17() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("C");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());

        InternetDomainName internetDomainName1 = internetDomainName0.registrySuffix();
        assertNull(internetDomainName1);
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste possui similaridade com os testes 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 e 17.
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são em parte compreesíveis.
    */
    @Test(timeout = 4000)
    public void test18() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("d");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertEquals("d", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());

        boolean boolean0 = internetDomainName0.isRegistrySuffix();
        assertFalse(boolean0);
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertEquals("d", internetDomainName0.toString());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     a chamada do método topPrivateDomain() com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test19() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("com.google.common.collect.Hashing");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertFalse(internetDomainName0.hasPublicSuffix());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertEquals("com.google.common.collect.hashing", internetDomainName0.toString());
        assertFalse(internetDomainName0.isRegistrySuffix());

        // Undeclared exception!
        try {
            internetDomainName0.topPrivateDomain();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // Not under a public suffix: com.google.common.collect.hashing
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test20() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("C");
        assertNotNull(internetDomainName0);
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.hasPublicSuffix());

        InternetDomainName internetDomainName1 = internetDomainName0.publicSuffix();
        assertNull(internetDomainName1);
        assertFalse(internetDomainName0.isTopDomainUnderRegistrySuffix());
        assertFalse(internetDomainName0.isPublicSuffix());
        assertFalse(internetDomainName0.isUnderPublicSuffix());
        assertFalse(internetDomainName0.isTopPrivateDomain());
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(internetDomainName0.isRegistrySuffix());
        assertFalse(internetDomainName0.isUnderRegistrySuffix());
        assertEquals("c", internetDomainName0.toString());
        assertFalse(internetDomainName0.hasPublicSuffix());
    }


    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test21() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("d");
        boolean boolean0 = internetDomainName0.isPublicSuffix();
        assertFalse(internetDomainName0.hasRegistrySuffix());
        assertFalse(boolean0);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test22() throws Throwable {
        boolean boolean0 = InternetDomainName.isValid("5by8u");
        assertFalse(boolean0);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     a chamada do método from() com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test23() throws Throwable {
        // Undeclared exception!
        try {
            InternetDomainName.from("com.google.thirdpart_.publicsuffix.rieparser.");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Not a valid domain name: 'com.google.thirdpart_.publicsuffix.rieparser'
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test28() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("p");
        internetDomainName0.parts();
        assertFalse(internetDomainName0.hasRegistrySuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test29() throws Throwable {
        InternetDomainName internetDomainName0 = new InternetDomainName("p");
        internetDomainName0.toString();
        assertFalse(internetDomainName0.hasRegistrySuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test32() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("C");
        InternetDomainName internetDomainName1 = internetDomainName0.child("C");
        assertEquals("c.c", internetDomainName1.toString());
        assertFalse(internetDomainName1.hasRegistrySuffix());
        assertFalse(internetDomainName1.isPublicSuffix());
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se
    *     os valores inciais de InternetDomainName são iguais aos esperados.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test33() throws Throwable {
        InternetDomainName internetDomainName0 = InternetDomainName.from("com.google.common.collect.Hashing");
        internetDomainName0.parent();
    }
}

// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.oauth2.useragent.subprocess;

import java.io.InputStream;
import java.io.OutputStream;

public class DefaultProcess implements TestableProcess {

    private final Process process;

    public DefaultProcess(final Process process) {
        this.process = process;
    }

    @Override
    public InputStream getErrorStream() {
        return process.getErrorStream();
    }

    @Override
    public InputStream getInputStream() {
        return process.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() {
        return process.getOutputStream();
    }

    @Override
    public int waitFor() throws InterruptedException {
        return process.waitFor();
    }
}

package org.jbpm.designer.vdpe;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jbpm.designer.repository.vfs.RepositoryDescriptor;
import org.jbpm.designer.web.preprocessing.IDiagramPreprocessingUnit;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.uberfire.backend.vfs.VFSService;
import org.uberfire.io.IOService;

/**
 * CmmnPreprocessingUnit - preprocessing unit for the cmmn profile
 *
 */
public class VdmlPropositionExchangePreprocessingUnit implements IDiagramPreprocessingUnit {
    public VdmlPropositionExchangePreprocessingUnit(ServletContext servletContext, VFSService vfsService) {

    }
    @Override
    public void preprocess(HttpServletRequest request, HttpServletResponse response, IDiagramProfile profile, ServletContext serlvetContext, boolean readOnly,
            boolean viewLocked, IOService ioService, RepositoryDescriptor descriptor) {
        
    }

	@Override
    public String getOutData() {
	    return null;
    }
}

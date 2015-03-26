package com.myapp.struts.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionMessage;


public class EditEmployeAction extends SuperAction {

    protected void updateUser(ActionForm form) throws Exception {
          this.getService().updateUser(form); 
    }

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        // Cible par defaut en cas de succes
        String target = "success";

        // Teste sur l'identification de l'utilisateur
        HttpSession session = request.getSession();
        if (session.getAttribute("USER") == null) {

            // L'utilisateur n'est pas identifie
            target = "login";
            ActionMessages errors = new ActionMessages();

            errors.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.login.required"));

            // Retourner les erreurs eventuelles au formulaire
            // d'origine.
            if (!errors.isEmpty()) {

                saveErrors(request, errors);
            }
            // Transmettre la requete a la vue appropriee
            return (mapping.findForward(target));
        }

        if (isCancelled(request)) {

            // Action annulee
            return (mapping.findForward(target));
        }

        try {

            updateUser(form);
        } catch (Exception e) {

            target = "error";
            ActionMessages errors = new ActionMessages();

            errors.add(ActionMessages.GLOBAL_MESSAGE,
                    new ActionMessage("errors.database.error",
                            e.getMessage()));

            // Signaler les erreurs eventuelles
            if (!errors.isEmpty()) {

                saveErrors(request, errors);
            }
        }
        // Transmettre la requete a la vue appropriee
        return (mapping.findForward(target));
    }
}

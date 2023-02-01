/* Apply adapters to all occurrences of these types in this package */

@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(type = DiversionReason.class, value = DiversionReasonAdapter.class),
        @XmlJavaTypeAdapter(type = DiversionTreatment.class, value = DiversionTreatmentAdapter.class)
})
package org.openapitools.client.model.bxml;

import org.openapitools.client.model.bxml.adapter.DiversionReasonAdapter;
import org.openapitools.client.model.bxml.adapter.DiversionTreatmentAdapter;
import org.openapitools.client.model.DiversionReason;
import org.openapitools.client.model.DiversionTreatment;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

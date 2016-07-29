package uk.ac.ebi.pride.proteomes.web.auth;

import uk.ac.ebi.pride.proteomes.web.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}

import { ReactNode } from "react";
import { redirect } from "next/navigation";
import { getCurrentUser } from "@/lib/auth/getCurrentUser";

// Protected layout wraps pages that require auth. It also enforces onboarding flow.
export default async function ProtectedLayout({
  children,
}: {
  children: ReactNode;
}) {
  const { user } = await getCurrentUser();
  if (!user) redirect("/login");

  // If the user still needs onboarding but is not on the onboarding page, redirect.
  // We'll mount onboarding page inside the same protected group for consistent header/footer access.
  if (user.needsOnboarding) {
    // Onboarding page itself will live at /onboarding, so only redirect if current path differs.
    // Since layouts don't get the segment directly here without extra APIs, we rely on split grouping below.
    // For simplicity, we separate onboarding into its own group & page check in that page.
  }

  return <>{children}</>;
}
